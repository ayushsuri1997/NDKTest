#include <jni.h>

jdouble Java_com_example_factlib_factlib_helloWorld(JNIEnv* env, jobject obj, jint num){

    jint fact=1;
    for(jint i=num;i>0;i--){
        fact=fact*i;
    }
    return fact;
}