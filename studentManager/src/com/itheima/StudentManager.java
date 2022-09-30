package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<>();

        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    removeStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }

    public static boolean isUsed(ArrayList<Student> arr, String sid) {
        for (int i = 0; i < arr.size(); i ++ ) {
            Student s = arr.get(i);
            if (s.getSid().equals(sid)) {
                return true;
            }
        }
        return false;
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            if (isUsed(array, sid)) {
                System.out.println("该生已存在，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setSid(sid);
        s.setAddress(address);

        array.add(s);
        System.out.println("添加学生成功");
    }

    public static void removeStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i ++ ) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("该学生不存在，请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除成功");
        }
    }

    public static void updateStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < arr.size(); i ++ ) {
            Student s = arr.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("该学生不存在，请重新输入");
        } else {
            System.out.println("请输入学生的新姓名");
            String name = sc.nextLine();
            System.out.println("请输入学生的新年龄");
            String age = sc.nextLine();
            System.out.println("请输入学生的新居住地");
            String address = sc.nextLine();

            Student s = new Student();
            s.setName(name);
            s.setAge(age);
            s.setSid(sid);
            s.setAddress(address);

            arr.set(index, s);
            System.out.println("修改学生信息成功");
        }
    }

    public static void findAllStudent(ArrayList<Student> arr) {
        if (arr.size() == 0) {
            System.out.println("无信息，请先添加信息");
            return ;
        }

        System.out.println("姓名\t\t年龄\t\t学号\t\t\t居住地");

        for (int i = 0; i < arr.size(); i ++ ) {
            Student s = arr.get(i);
            System.out.println(s.getName()+"\t"+s.getAge()+"\t\t"+s.getSid()+"\t"+s.getAddress());
        }
    }

}
