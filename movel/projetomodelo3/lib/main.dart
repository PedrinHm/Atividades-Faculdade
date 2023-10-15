import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Color(0xffffc89f),
        body: Container(
          child: Column(
            children: [
              Container(
                color: Color(0xffffc89f),
                height: 318,
                width: double.infinity,
                child: Image.asset('images/avatar1.png'),
              ),
              Container(
                child: Stack(
                  children: [
                    newMethod2(
                      backgroundColor: Colors.white,
                      borderRadius: BorderRadius.only(
                        topRight: Radius.circular(50),
                        topLeft: Radius.circular(50),
                      ),
                    ),
                    Container(
                      child: Column(
                        children: [
                          newMethod4(),
                          newMethod5(),
                          Column(
                            children: [
                              newMethod(
                                text: 'Tarefa 4',
                                subText: 'Criar tela 1',
                                icon: Icons.check_circle,
                                image: Image.asset('images/tela1.png'),
                              ),
                              newMethod(
                                text: 'Tarefa 3',
                                subText: 'Criar tela 2',
                                icon: Icons.check_circle,
                                image: Image.asset('images/tela1.png'),
                              ),
                              newMethod(
                                text: 'Tarefa 2',
                                subText: 'Configurar ambiente',
                                icon: Icons.check_circle,
                                image: Image.asset('images/ambiente.png'),
                              ),
                              newMethod(
                                text: 'Tarefa 1',
                                subText: 'Estudar Flutter',
                                icon: Icons.check_circle,
                                image: Image.asset(
                                    'images/flutterIcon-removebg-preview.png'),
                              ),
                            ],
                          ),
                        ],
                      ),
                    ),
                  ],
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }

  Container newMethod5() {
    return Container(
      margin: EdgeInsets.only(left: 30, right: 30),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Text(
            "4 tarefas",
            style: TextStyle(
              fontSize: 20,
              fontFamily: 'Futura',
              fontWeight: FontWeight.bold,
            ),
          ),
          Text(
            "8h 30m",
            style: TextStyle(
              fontSize: 20,
              fontFamily: 'Futura',
              fontWeight: FontWeight.bold,
            ),
          )
        ],
      ),
    );
  }

  Container newMethod4() {
    return Container(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.start,
        children: [
          Container(
            width: 400,
            alignment: Alignment.bottomLeft,
            margin:
                EdgeInsets.only(left: 20.0, right: 20.0, top: 20, bottom: 15),
            child: Text(
              "Dev. Mobile",
              style: TextStyle(
                fontSize: 37,
                fontFamily: 'Futura',
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
          Container(
            width: 400,
            alignment: Alignment.bottomLeft,
            margin:
                EdgeInsets.only(left: 20.0, right: 20.0, top: 20, bottom: 15),
            child: Text(
              "Jefferson Manuel",
              style: TextStyle(
                fontSize: 18,
                fontFamily: 'Futura',
              ),
            ),
          ),
        ],
      ),
    );
  }

  Container newMethod2({
    required Color backgroundColor,
    required BorderRadiusGeometry borderRadius,
  }) {
    return Container(
      height: 626.0,
      width: double.infinity,
      decoration: BoxDecoration(
        color: backgroundColor,
        borderRadius: borderRadius,
      ),
    );
  }

  Container newMethod({
    required String text,
    required String subText,
    required IconData icon,
    required Widget image,
  }) {
    return Container(
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(12),
      ),
      margin: EdgeInsets.only(left: 20.0, right: 20.0, top: 15),
      width: 450,
      height: 100,
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Container(
            margin: EdgeInsets.all(5),
            decoration: BoxDecoration(
              color: Color.fromARGB(255, 255, 255, 255),
              borderRadius: BorderRadius.circular(12),
            ),
            child: image,
          ),
          Container(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text(
                  text,
                  style: TextStyle(
                    fontSize: 24,
                    fontFamily: 'Futura',
                    fontWeight: FontWeight.bold,
                  ),
                ),
                Text(
                  subText,
                  style: TextStyle(
                    fontSize: 15,
                    fontFamily: 'Futura',
                  ),
                ),
              ],
            ),
          ),
          Container(
            child: Icon(
              icon,
              color: Colors.green,
            ),
          ),
        ],
      ),
    );
  }
}
