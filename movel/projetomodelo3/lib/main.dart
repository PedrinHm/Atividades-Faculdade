import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: const Color.fromARGB(255, 229, 180, 255),
        body: Align(
        alignment: Alignment.bottomCenter,
          child: Container(
            margin: const EdgeInsets.all(0.0),
            width:  double.infinity,
            height: 420.0,
            decoration: const BoxDecoration(
              borderRadius: BorderRadius.only(
                topLeft: Radius.circular(50.0),
                topRight: Radius.circular(50.0)
                ),
              color: Color.fromARGB(255, 255, 255, 255),
            ),
            child: Container(
              margin: const EdgeInsets.only(
                left: 30.0,
                top: 50.0,    
                right: 300.0, 
                bottom: 15.0, 
               ),
              child: const Text(
              'Spanish language', 
              textAlign: TextAlign.left,
              style: TextStyle(fontSize: 40),

              ),
            ),
          ),
        ),
      ),
    );
  }
}