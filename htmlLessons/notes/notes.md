  1. First  JVM  gets  loaded  
  1. Main  method  gets  Executed  
  1. ApplicationContext  is  loaded  
  1. ApplicationContext  reads  xml  configuration  file  
  1. ApplicationContext  preloads  one  object  for  each  bean  in  configuration  file  
            if the bean is not marked as lazy-init ="true"
  1. lazy-init="true"  this  informs  springcontainer  not  to  preload  object  for  this  bean  
  1. By  default  Spring  early  loads  objects  in  memory.   
  1. For  lazy  init  beans  object  is  created  only  when  the  getbeans()  method  is  called.   
  1. For  lazy  init  beans  getbeans()  returns  the  reference  of  the  pre  loaded  object.  
  1. By  default  only  one  object  for  every  bean  is  created(singleton)  
  1. singleton:  atleast  one  object  for  every  class  but  not  more  than  one  object  
  1. spring  for  lazy  init  beans  creates  a  singleton  object  on  first  call  of  getbeans()  method  
  and  then  uses  that  object  for  future  getBeans()  method  calls  
  
---
  
## Prototype  
 - Prototype beans are by default lazy-init  
 - Prototypes are not singleton  
 - A new object is created for Prototype when getBean() method is called every time  
  
```java
		<bean id="act" class="com.chainsys.projectA.beans.Actor" scope="prototype"></bean>	
```
---
## Beans with parameterize

```java
<bean id="film" class="com.chainsys.projectA.beans.Movie">
  	<constructor-arg type="java.lang.String" value="Vikram" />
  	<constructor-arg type="java.lang.String" value="Lokesh" />
  	</bean>
```

---
## Factory method

## LifeCycle Methods:
	1. init-method is post object creation
	2. destroy method is pre object destruction.
## Init-method

 - This method can be used to setup the object before it is ready for service calls