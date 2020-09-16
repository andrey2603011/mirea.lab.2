package ru.mirea.lab2;

class Main
{
    public static void main(String[] args)
    {
        Author author1 = new Author("Sergey", "sergey@domain.url", 'M');
        Author author2 = new Author("Andrey", "andrey@domain.url", 'M');

        System.out.println(author1);
        System.out.println();
        System.out.println(author2);
    }
}