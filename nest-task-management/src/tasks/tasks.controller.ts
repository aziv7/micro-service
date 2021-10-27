import { AuthService } from './../auth/auth.service';
import { GetTasksFilterDto } from './dto/get-tasks-filter.dto';
import { CreateTaskDto } from './dto/create-task.dto';
import { Body, Controller, Delete, Get, Param, Patch, Post, Query } from '@nestjs/common';

import { TasksService } from './tasks.service';
import { UpdateTaskStatusDto } from './dto/update-task-status.dto';
import { TaskStatus } from './task-status.enum'
import { Task } from './task.entity';

@Controller('tasks')
export class TasksController {
    /**
     *
     */
    constructor(private tasksService: TasksService) {}

    @Get()
    getTasks(@Query() filterDto: GetTasksFilterDto): Promise<Task[]> {

        return this.tasksService.getTasks(filterDto)
    }
    @Get('/:id')
    getTaskById(@Param('id') id: string): Promise<Task> {
        return this.tasksService.getTaskById(id)
    }
    @Post()
    createTask(@Body() createTaskDto: CreateTaskDto): Promise<Task> {
        return this.tasksService.createTask(createTaskDto)
    }


    @Delete(':id')
    delteTask(@Param('id') id: string): Promise<void> {
        return this.tasksService.deleteTask(id)
    }


    @Patch('/:id/status')
    updateTaskStatus(@Param('id') id: string, @Body() updateTaskStatusDto: UpdateTaskStatusDto): Promise<Task> {
        const { status } = updateTaskStatusDto
        return this.tasksService.updateTaskStatus(id, status)
    }
}






// @Get()
    // getTasks(@Query() filterDto: GetTasksFilterDto): Task[] {
    //     if (Object.keys(filterDto).length) {
    //         return this.tasksService.getTasksWithFilter(filterDto)
    //     } else {
    //         return this.tasksService.getAlltasks()
    //     }
    // }
    // // @Post()
    // // createTask(@Body() body): Task {
    // //     return this.tasksService.createTask()
    // // }
    // // @Post()
    // // createTask(
    // //     @Body('title') title : string,
    // //     @Body('description') description
    // // ): Task {
    // //     return this.tasksService.createTask(title, description)
    // // }
    // @Post()
    // createTask(
    //     @Body() createTaskDto: CreateTaskDto
    // ): Task {
    //     return this.tasksService.createTask(createTaskDto)
    // }

    // @Get(':id')
    // getTaskById(@Param('id') id: string): Task {
    //     return this.tasksService.getTaskById(id)
    // }


    // @Delete(':id')
    // delteTask(@Param('id') id: string): void {
    //     this.tasksService.deleteTask(id)
    // }

    // @Patch('/:id/status')
    // updateTaskStatus(@Param('id') id: string, @Body() updateTaskStatusDto: UpdateTaskStatusDto): Task {
    //     const { status } = updateTaskStatusDto
    //     return this.tasksService.updateTaskStatus(id, status)
    // }