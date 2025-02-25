package com.leverx.course.exceptions;

public class SuppressedException {

    static class ExampleResource implements AutoCloseable {

        String name;

        ExampleResource(String name) {
            this.name = name;
        }

        public void use() throws Exception{
            throw new Exception(name + " has failed during use!");
        }

        @Override
        public void close() throws Exception {
            throw new Exception(name + " has failed during close!");
        }
    }

    public static void main(String[] args) {

        try (ExampleResource resource_1 = new ExampleResource("Resource_1");
             ExampleResource resource_2 = new ExampleResource("Resource_2")) {

            resource_1.use();
            resource_2.use();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
