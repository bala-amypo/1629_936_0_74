package com.example.demo.entity;


@
public class TimeStamp{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min =2,max=10,message="must be 2 to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
}