//
//  ContentView.swift
//  Rusty
//
//  Created by Darragh Downey on 15/08/2021.
//

import SwiftUI

struct ContentView: View {
    @State var img_name: String = "dice_1"
    
    var body: some View {
        VStack{
        Image(img_name)
            .resizable()
            .scaledToFit()
            .frame(width: 160, height: 200, alignment: /*@START_MENU_TOKEN@*/.center/*@END_MENU_TOKEN@*/)
        Button(action: {
            let num = rando()
            switch(num) {
            case 1:
                self.img_name = "dice_1"
            case 2:
                self.img_name = "dice_2"
            case 3:
                self.img_name = "dice_3"
            case 4:
                self.img_name = "dice_4"
            case 5:
                self.img_name = "dice_5"
            default:
                self.img_name = "dice_6"
            }
        }){
                Text("Roll Dice")
            .padding(10.0)
            .overlay(RoundedRectangle(cornerRadius: 10.0)
                        .stroke(lineWidth: 2))
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        Group {
            ContentView()
        }
    }
}

func rando() -> Int {
    let num = Int.random(in: 1...6)
    return num
}
