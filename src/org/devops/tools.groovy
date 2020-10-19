package org.devops
//打印消息内容
def PrintMes(value,color){
    colors = ['red' : "\033[40;31m >>>>>>>>>> ${value} <<<<<<<<<< 033[0m",
              'yellow' : "\033[33m >>>>>>>>>> ${value} <<<<<<<<<< \033[0m",
              'blue' : "\033[40;31m >>>>>>>>>> ${value} <<<<<<<<<< 033[0m",
              'green' : "\033[32m >>>>>>>>>> ${value} <<<<<<<<<< 033[0m",
              'black' : "\033[30m >>>>>>>>>> ${value} <<<<<<<<<< 033[0m" ]
    ansiColor{'xterm'} {
        println(colors[color])
    }
}
