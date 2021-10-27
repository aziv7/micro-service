//import { Task } from './task.model';
//import { v4 as uuid } from 'uuid'
import { GetTasksFilterDto } from './dto/get-tasks-filter.dto';
import { CreateTaskDto } from './dto/create-task.dto';
import { Injectable, NotFoundException } from '@nestjs/common';
import { TaskStatus } from './task-status.enum'
import { TasksRepository } from './tasks.repository';
import { InjectRepository } from '@nestjs/typeorm';
import { Task } from './task.entity';
@Injectable()
export class TasksService {
    /**
     *
     */
    constructor(@InjectRepository(TasksRepository) private tasksRepository: TasksRepository) {}


    getTasks(filterDto: GetTasksFilterDto): Promise<Task[]> {
        return this.tasksRepository.getTasks(filterDto)
    }
    async getTaskById(id: string): Promise<Task> {
        const found = await this.tasksRepository.findOne(id)
        if (!found) {
            throw new NotFoundException(`task with id ${id} not found`)
        }
        return found
    }

    createTask(createTaskDto: CreateTaskDto): Promise<Task> {
        return this.tasksRepository.createTask(createTaskDto)
    }

    async deleteTask(id: string): Promise<void> {
        // const task = await this.getTaskById(id)
        // if (!task) {
        //     throw new NotFoundException(`task with id ${id} not found`)
        // }
        // await this.tasksRepository.remove(task)
        const result = await this.tasksRepository.delete(id)
        if (result.affected === 0) {
            throw new NotFoundException(`task with id ${id} not found`)
        }
    }

    async updateTaskStatus(id: string, status: TaskStatus): Promise<Task> {
        const task = await this.getTaskById(id)
        task.status = status
        await this.tasksRepository.save(task)
        return task
    }
}








 // private tasks: Task[] = [];

    // getAlltasks(): Task[] {
    //     return this.tasks;
    // }

    // getTasksWithFilter(filterDto: GetTasksFilterDto): Task[] {
    //     const { status, search } = filterDto
    //     let tasks = this.getAlltasks()
    //     if (status) {
    //         tasks = tasks.filter(task => task.status === status)
    //     } if (search) {
    //         tasks = tasks.filter(task => task.title.includes(search) || task.description.includes(search) ? true : false)
    //     }
    //     return tasks
    // }
    // createTask(createTaskDto: CreateTaskDto): Task {
    //     const { title, description } = createTaskDto
    //     const task: Task = {
    //         id: uuid(),
    //         title,
    //         description,
    //         status: TaskStatus.OPEN
    //     }
    //     this.tasks.push(task)
    //     return task
    // }
    // getTaskById(id: string): Task {
    //     const found = this.tasks.find(t => t.id === id)
    //     if (!found) {
    //         throw new NotFoundException(`task with id ${id} not found`)
    //     } else {
    //         return found
    //     }
    // }

    // deleteTask(id: string): void {
    //     const found = this.getTaskById(id)
    //     this.tasks = this.tasks.filter((task) => task.id !== found.id)
    // }
    // updateTaskStatus(id: string, status: TaskStatus) {
    //     const task = this.getTaskById(id)
    //     task.status = status
    //     return task
    // }