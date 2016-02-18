//
//  ViewController.swift
//  tipCalculator
//
//  Created by Jessie Albarian on 2/17/16.
//  Copyright © 2016 babyllama. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet weak var billAmount: UITextField!
    @IBOutlet weak var percentTip: UITextField!
    @IBOutlet weak var tip: UILabel!
    
    
    @IBAction func calcBtn(sender: AnyObject) {
        let amount = (billAmount.text! as NSString).floatValue
        let pct = (percentTip.text! as NSString).floatValue/100
        
        let totalTip = amount*pct
        
        let currencyFormatter = NSNumberFormatter()
        currencyFormatter.numberStyle = NSNumberFormatterStyle.CurrencyStyle
        tip.text = currencyFormatter.stringFromNumber(totalTip)
    }
    
    func textFieldShouldReturn(textField: UITextField) -> Bool {
        self.view.endEditing(true)
        return false
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        billAmount.delegate = self
        percentTip.delegate = self
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

