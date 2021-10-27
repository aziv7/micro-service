import { IsNotEmpty } from "class-validator"

export class CreateTaskDto {
    @IsNotEmpty({ message: 'title required' })
    title: string
    @IsNotEmpty()
    description: string
}