package com.dozy.ayurvedaconverter;

public class Calculate {

    //Calculate calculate = new Calculate();
    public static String calculate(String type, Double value, String unit) {

        String output = "", tempString = "";

        double temp = 0;
//        value = (double)value;

        if (type == "length") {
            switch (unit) {
                case "YAVODARA":
                    temp = value * 0.0024;
                    break;
                case "ANGULA":
                    temp = value * 0.0195;
                    break;
                case "BITAHASTI":
                    temp = value * 0.2286;
                    break;
                case "ARATNI":
                    temp = value * 0.4191;
                    break;
                case "HASTA":
                    temp = value * 0.4572;
                    break;
                case "RAJAHASTA (NRIPAHASTA)":
                    temp = value * 0.5588;
                    break;
                case "VYAMA":
                    temp = value * 1.8288;
                    break;
                case "Meter":
                    temp = value;
                    break;
                case "Kilometer":
                    temp = value * 1000;
                    break;
                case "Centimeter":
                    temp = value * 0.01;
                    break;
                case "Millimeter":
                    temp = value * 0.001;
                    break;
                case "Micrometer":
                    temp = value * 0.000001;
                    break;
                case "Nanometer":
                    temp = value * 0.000000001;
                    break;
                case "Mile":
                    temp = value * 1609.35;
                    break;
                case "Yard":
                    temp = value * 0.9144;
                    break;
                case "Foot":
                    temp = value * 0.3048;
                    break;
                case "Inch":
                    temp = value * 0.0254;
                    break;
                default:
                    temp = 0;
                    break;
            }

            tempString = "";
            tempString = "YAVODARA: " + temp / 0.0024 +
                    "\nANGULA: " + temp / 0.0195 +
                    "\nBITAHASTI: " + temp / 0.2286 +
                    "\nARATNI: " + temp / 0.4191 +
                    "\nHASTA: " + temp / 0.4572 +
                    "\nRAJAHASTA (NRIPAHASTA): " + temp / 0.5588 +
                    "\nVYAMA: " + temp / 1.8288 +
                    "\nMeter: " + temp +
                    "\nKilometer: " + temp / 1000 +
                    "\nCentimeter: " + temp / 0.01 +
                    "\nMillimeter: " + temp / 0.001 +
                    "\nMicrometer: " + temp / 0.000001 +
                    "\nNanometer: " + temp / 0.000000001 +
                    "\nMile: " + temp / 1609.35 +
                    "\nYard: " + temp / 0.9144 +
                    "\nFoot: " + temp / 0.3048 +
                    "\nInch: " + temp / 0.0254;
            output = ""; //Flushing Memory Values

            output = output + tempString;

        } else if (type == "time") {
            switch (unit) {
                case "KSANA":
                    temp = value * 0.38;
                    break;
                case "LAVA":
                    temp = value * 0.77;
                    break;
                case "NIMESHA":
                    temp= value *1.55;
                    break;
                case "KASTHA":
                    temp = value * 4.66;
                    break;
                case "KALA":
                    temp = value * 140;
                    break;
                case "GHATI":
                    temp = value * 1440;
                    break;
                case "MUHURTA":
                    temp = value * 2880;
                    break;
                case "AHORATRA":
                    temp = value * 86400;
                    break;
                case "PAKSA":
                    temp = value* 1296000;
                    break;
                case "MASA":
                    temp = value * 2592000;
                    break;
                case "RITU":
                    temp = value * 5184000;
                    break;
                case "AYANA":
                    temp = value * 15778800;
                    break;
                case "SAMVATSARA":
                    temp = value * 31557600;
                    break;
                case "YUGA":
                    temp = value * 157788000;
                    break;
                case "Second":
                    temp = value;
                    break;
                case "Millisecond":
                    temp = value * 0.001;
                    break;
                case "Microsecond":
                    temp = value * 0.000001;
                    break;
                case "Nanosecond":
                    temp = value * 0.000000001;
                    break;
                case "Picosecond":
                    temp = value * 0.000000000001;
                    break;
                case "Minute":
                    temp = value * 60;
                    break;
                case "Hour":
                    temp = value * 3600;
                    break;
                case "Day":
                    temp = value * 86400;
                    break;
                case "Week":
                    temp = value * 604800;
                    break;
                case "Month":
                    temp = value * 2629800;
                    break;
                case "Year":
                    temp = value * 31557600;
                    break;
                default:
                    temp = 0;
                    break;
            }

            tempString = "";
            tempString = "KSANA: "+ temp / 0.38+
            "\nLAVA: "+ temp / 0.77+
                    "\nNIMESHA: "+ temp/1.55+
                    "\nKASTHA: "+ temp / 4.66+
                    "\nKALA: "+ temp / 140+
                    "\nGHATI: "+ temp / 1440+
                    "\nMUHURTA: "+  temp / 2880+
                    "\nAHORATRA: "+ temp / 86400+
                    "\nPAKSA: "+ temp / 1296000+
                    "\nMASA: "+ temp / 2592000+
                    "\nRITU: "+ temp / 5184000+
                    "\nAYANA: "+ temp / 15778800+
                    "\nSAMVATSARA: "+ temp / 31557600+
                    "\nYUGA: "+ temp / 157788000+
                    "\nSecond: "+ temp+
                    "\nMillisecond: "+ temp / 0.001+
                    "\nMicrosecond: "+ temp / 0.000001+
                    "\nNanosecond: "+ temp / 0.000000001+
                    "\nPicosecond: "+ temp / 0.000000000001+
                    "\nMinute: "+ temp / 60+
                    "\nHour: "+ temp / 3600+
                    "\nDay: "+temp / 86400+
                    "\nWeek: "+ temp / 604800+
                    "\nMonth: "+ temp / 2629800+
                    "\nYear: "+ temp / 31557600;
            output = ""; //Flushing Memory Values

            output = output + tempString;

        } else if (type == "weight") {
            switch (unit) {
                case "PARMANU":
                    temp = value * 0.0000000016;
                    break;
                case "DHAVANSHI":
                    temp = value * 0.00000005;
                    break;
                case "MARICHI":
                    temp = value * 0.00000032;
                    break;
                case "LAL SARSHAP":
                    temp = value * 0.00000195;
                    break;
                case "TUNDAL":
                    temp = value * 0.00001562;
                    break;
                case "DHANYAMASH":
                    temp = value * 0.00003125;
                    break;
                case "YAVA":
                    temp = value * 0.0000625;
                    break;
                case "RATTI":
                    temp = value * 0.000125;
                    break;
                case "ANDIKA":
                    temp = value * 0.00025;
                    break;
                case "MASHAK (MASA)":
                    temp = value * 0.001;
                    break;
                case "SHAAN":
                    temp = value * 0.003;
                    break;
                case "KOL":
                    temp = value * 0.006;
                    break;
                case "TOLA":
                    temp = value * 0.012;
                    break;
                case "KARSHA":
                    temp = value * 0.012;
                    break;
                case "SHUKTI":
                    temp = value * 0.024;
                    break;
                case "PAL":
                    temp = value * 0.048;
                    break;
                case "CHHATANK":
                    temp = value * 0.06;
                    break;
                case "PRASRTIS":
                    temp = value * 0.096;
                    break;
                case "CHHATAAK":
                    temp = value * 0.0186;
                    break;
                case "KUDAV":
                    temp = value * 0.192;
                    break;
                case "MANIKA":
                    temp = value * 0.384;
                    break;
                case "PRASTHA (PRASTH)":
                    temp = value * 0.768;
                    break;
                case "SER (SERA or SEER)":
                    temp = value * 0.96;
                    break;
                case "ADHAKA (AADAK)":
                    temp = value * 3.073;
                    break;
                case "TULA":
                    temp = value * 4.8;
                    break;
                case "DRONA (DRON)":
                    temp = value * 12.228;
                    break;
                case "SURPA (SHOORP)":
                    temp = value * 24.576;
                    break;
                case "DRONI":
                    temp = value * 49.152;
                    break;
                case "BHARA":
                    temp = value * 96;
                    break;
                case "KHARI":
                    temp = value * 192.608;
                    break;
                case "Kilogram":
                    temp = value * 1;
                    break;
                case "Gram":
                    temp = value * 0.001;
                    break;
                case "Milligram":
                    temp = value * 0.000001;
                    break;
                case "Metric Ton":
                    temp = value * 1000;
                    break;
                case "Long Ton":
                    temp = value * 1016.04608;
                    break;
                case "Short Ton":
                    temp = value * 907.184;
                    break;
                case "Pound":
                    temp = value * 0.453592;
                    break;
                case "Ounce":
                    temp = value * 0.0283495;
                    break;
                case "Carrat":
                    temp = value * 0.0002;
                    break;
            }
            tempString = "";
            tempString = "PARMANU: " + temp / 0.0000000016+
                    "\nDHAVANSHI: " + temp / 0.00000005+
                    "\nMARICHI: " +  temp / 0.00000032+
                    "\nLAL SARSHAP: " +  temp / 0.00000195+
                    "\nTUNDAL: " +  temp / 0.00001562+
                    "\nDHANYAMASH: " +  temp / 0.00003125+
                    "\nYAVA: " +  temp / 0.0000625+
                    "\nRATTI: " +  temp / 0.000125+
                    "\nANDIKA: " +  temp / 0.00025+
                    "\nMASHAK (MASA): " + temp / 0.001+
                    "\nSHAAN: " +  temp / 0.003+
                    "\nKOL: " + temp / 0.006+
                    "\nTOLA: " + temp / 0.012+
                    "\nKARSHA: " + temp / 0.012+
                    "\nSHUKTI: " + temp / 0.024+
                    "\nPAL: " + temp / 0.048+
                    "\nCHHATANK: " +  temp / 0.06+
                    "\nPRASRTIS: " + temp / 0.096+
                    "\nCHHATAAK: " + temp / 0.0186+
                    "\nKUDAV: " + temp / 0.192+
                    "\nMANIKA: " + temp / 0.384+
                    "\nPRASTHA (PRASTH): " + temp / 0.768+
                    "\nSER (SERA or SEER): " + temp / 0.96+
                    "\nADHAKA (AADAK): " + temp / 3.073+
                    "\nTULA: " + temp / 4.8+
                    "\nDRONA (DRON): " + temp / 12.228+
                    "\nSURPA (SHOORP): " + temp / 24.576+
                    "\nDRONI: " + temp / 49.152+
                    "\nBHARA: " + temp / 96+
                    "\nKHARI: " + temp / 196.608+
                    "\nKilogram: " + temp+
                    "\nGram: " + temp / 0.001+
                    "\nMilligram: " +  temp / 0.000001+
                    "\nMetric Ton: " + temp / 1000+
                    "\nLong Ton: " + temp / 1016.04608+
                    "\nShort Ton: " + temp / 907.184+
                    "\nPound: " + temp / 0.453592+
                    "\nOunce: " + temp / 0.0283495+
                    "\nCarrat: " + temp / 0.0002;

                      output = ""; //Flushing Memory Values
                    output = output + tempString;
               }
            return output;

        }
}

