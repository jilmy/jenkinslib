package org.devops

//格式化输出printMes
def PrintMes(value,color) {
    colors = ['red' : "\033[40;31m >>>>>>>>>> ${value} <<<<<<<<<< \033[0m",
              'yellow' : "\033[33m >>>>>>>>>> ${value} <<<<<<<<<< \033[0m",
              'blue' : "\033[40;31m >>>>>>>>>> ${value} <<<<<<<<<< \033[0m",
              'green' : "\033[32m >>>>>>>>>> ${value} <<<<<<<<<< \033[0m",
              'black' : "\033[30m >>>>>>>>>> ${value} <<<<<<<<<< \033[0m" ]
    ansiColor('xterm') {
        println(colors[color])
    }
}

//格式化输出
def FormatOutput(value,color) {
    colors = [
        //字颜色：30—37
        //颜色说明：其中40的位置代表底色，31的位置是代表字的颜色
        //'red' : "\033[40;31m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'black' : "\033[30m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'red' : "\033[31m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'green' : "\033[32m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'yellow' : "\033[33m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'blue' : "\033[34m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'purple' : "\033[35m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'blueSky' : "\033[36m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'white' : "\033[37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",

        //字背景颜色范围：40—47
        'blackWhite' : "\033[40;37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'redWhite' : "\033[41;37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'greenWhite' : "\033[42;37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'yellowWhite' : "\033[43;37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'blueWhite' : "\033[44;37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'purpleWhite' : "\033[45;37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'blueSkyWhite' : "\033[46;37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m",
        'whiteBlack' : "\033[47;37m >>>>>>>>>>>>>>>>>>>> ${value} <<<<<<<<<<<<<<<<<<<< \033[0m"
    ]

    //jenkins中需要安装ansiColor插件才能配合使用
    ansiColor('xterm') {
        println(colors[color])
    }
}
