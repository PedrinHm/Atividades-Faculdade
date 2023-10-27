import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Teste',
      home: Scaffold(
        backgroundColor: Colors.white,
        body: SingleChildScrollView(
          child: Container(
            padding: const EdgeInsets.symmetric(horizontal: 40),
            child: Column(
              children: [
                Container(
                  margin: const EdgeInsets.symmetric(vertical: 40),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      const Icon(Icons.more_vert),
                      Image.asset(
                        'assets/images/avatar3.png',
                        width: 50,
                        height: 50,
                      ),
                    ],
                  ),
                ),
                Container(
                  alignment: Alignment.centerLeft,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      const Text(
                        'Hey\nTommy!',
                        textAlign: TextAlign.left,
                        style: TextStyle(
                          color: Color(0xff808080),
                          fontSize: 20,
                        ),
                      ),
                      const Text(
                        'Speaky freely anywhere',
                        textAlign: TextAlign.left,
                        style: TextStyle(
                          color: Color(0xff060B26),
                          fontSize: 55,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      Container(
                        margin: const EdgeInsets.symmetric(vertical: 50),
                        child: TextField(
                          decoration: InputDecoration(
                            hintText: 'Find your course',
                            prefixIcon: const Icon(Icons.search),
                            hintStyle: const TextStyle(
                              color: Color(0xff808080),
                            ),
                            border: OutlineInputBorder(
                              borderRadius: BorderRadius.circular(15),
                            ),
                          ),
                        ),
                      ),
                      const Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          Text(
                            'Continue course',
                            style: TextStyle(
                              color: Color(0xff060B26),
                              fontSize: 25,
                              fontWeight: FontWeight.w600,
                            ),
                          ),
                          Text(
                            'See All',
                            style: TextStyle(
                              color: Color(0xff060B26),
                              fontSize: 20,
                              fontWeight: FontWeight.normal,
                            ),
                          )
                        ],
                      ),
                      Container(
                        margin: const EdgeInsets.only(top: 20),
                        width: 1000.0,
                        height: 200.0,
                        decoration: BoxDecoration(
                          color: Color(0xffFFC89F),
                          borderRadius: BorderRadius.circular(50.0),
                        ),
                        padding: EdgeInsets.all(16.0),
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: [
                            Column(
                              crossAxisAlignment: CrossAxisAlignment.start,
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: [
                                Text(
                                  'Spanish \nlanguage',
                                  textAlign: TextAlign.left,
                                  style: TextStyle(
                                    fontSize: 25.0,
                                    fontWeight: FontWeight.w600,
                                  ),
                                ),
                                Text(
                                  '40 lessons',
                                  textAlign: TextAlign.left,
                                  style: TextStyle(
                                    fontSize: 15.0,
                                  ),
                                ),
                              ],
                            ),
                            SizedBox(width: 16.0),
                            Image.asset(
                              'assets/images/avatar2.png',
                              width: 150.0,
                              height: 150.0,
                            ),
                          ],
                        ),
                      ),
                      Container(
                        margin: const EdgeInsets.only(top: 20),
                        width: 1000.0,
                        height: 200.0,
                        decoration: BoxDecoration(
                          color: Color(0xff9ea9fe),
                          borderRadius: BorderRadius.circular(50.0),
                        ),
                        padding: EdgeInsets.all(16.0),
                        child: Column(
                          children: [
                            Row(
                              mainAxisAlignment: MainAxisAlignment.spaceBetween,
                              children: [
                                Column(
                                  crossAxisAlignment: CrossAxisAlignment.start,
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: [
                                    Text(
                                      'Spanish \nlanguage',
                                      textAlign: TextAlign.left,
                                      style: TextStyle(
                                        fontSize: 25.0,
                                        fontWeight: FontWeight.w600,
                                      ),
                                    ),
                                    Text(
                                      '40 lessons',
                                      textAlign: TextAlign.left,
                                      style: TextStyle(
                                        fontSize: 15.0,
                                      ),
                                    ),
                                  ],
                                ),
                                SizedBox(width: 16.0),
                                Image.asset(
                                  'assets/images/avatar1.png',
                                  width: 150.0,
                                  height: 150.0,
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
      ),
    );
  }
}
