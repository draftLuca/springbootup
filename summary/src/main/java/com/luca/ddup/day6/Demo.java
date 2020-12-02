package com.luca.ddup.day6;

/**
 * day6:scop作用域
 * 5中bean的sope及使用注意点:
 * ------------------spring容器自带------------------------------------
 *      singleton:
 *          默认，单例，一个应用程序用一份，程序初始化时注入容器（除了lazy加载的bean)
 *          注意：需要考虑线程安全问题
 *      prototype:
 *          多例的，通过容器每次获取的bean都是不同的实例，每次获取都会重新创建一个bean实例对象
 *-------------------spring web容器才有以下的sope-----------------------------------
 *      request:
 *          一次http请求中，一个bean对应一个实例
 *      session:
 *          session级别共享的bean，每个会话会对应一个bean实例，不同的session对应不同的bean实例
 *      application:
 *          一个web应用程序对应一个bean实例，通常情况下和singleton效果类似的，不过也有不一样的地方，
 *          singleton是每个spring容器中只有一个bean实例，一般我们的程序只有一个spring容器，但是，
 *          一个应用程序中可以创建多个spring容器，不同的容器中可以存在同名的bean，但是sope=aplication的时候，
 *          不管应用中有多少个spring容器，这个应用中同名的bean只有一个。
 *
 * 自定义作用域的实现:
 *       有时候，spring内置的几种sope都无法满足我们的需求的时候，我们可以自定义bean的作用域。
 *
 */
public class Demo {

}
