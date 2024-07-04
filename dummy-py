def distance(Xa, Xb, Ya, Yb):
    und_sqr = 0.00
    result = 0.0000
    try:
        und_sqr = (Xa - Xb) ** 2 + (Ya - Yb) ** 2
        result = und_sqr ** 0.5
        return result
    except:
        ValueError
    print("Dati doar numere")
    distance(Xa, Xb, Ya, Yb)


def pct_in_functie(Xm, Ym, Xa, Ya):
    Xresult = 0.00
    Yresult = 0.00
    try:
        Xresult = 2 * Xm - Xa
        Yresult = 2 * Ym - Ya
        return Xresult, Yresult
    except:
        ValueError
    print("Dati numere nu litere!!!")
    pct_in_functie(Xm, Ym, Xa, Ya)


def mij_sgmt(Xa, Xb, Ya, Yb):
    Xm = 0, 00
    Ym = 0, 00
    try:
        Xm = (int(Xa) + int(Xb)) / 2
        Ym = (int(Ya) + int(Yb)) / 2
        return Xm, Ym
    except:
        ValueError
    print("Dati doar numere!!!")
    mij_sgmt(Xa, Xb, Ya, Yb)


def maths():

    alg = input("pentru algebara apasati 1, ppentru geometrie apasati 2: ")
    if int(alg) == 1:
        print("Alege varianta: ")
        ach = input("pentru distanta 1, penrtru mijloc 2: ")
        if ach == 1:
            print("Perect!")
            alch = input(
                "pentru distanta normala , 1, pentru aflarea unui punct in functie de distanta si celalalt punct, 2"
            )
            if alch == 1:
                Xa = input("Dati abscisa lui a: ")
                Xb = input("Dati abscisa lui b: ")
                Ya = input("Dati ordonarta lui a: ")
                Yb = input("Dai ordonata lui b: ")
                print(distance(Xa, Xb, Ya, Yb))
                cont = input(
                    "Daca doriti sa continuati, apasati y, daca doriti sa iesiti, apasati n"
                )
                if cont == "y":
                    maths()
                elif cont == "n":
                    return 0
                else:
                    input(
                        "Am zis sa APASATI n sau y nu alt ceva! Apasati enter pentru a iesi"
                    )

            else:
                print("Am zix apasati 1 sau 2!")
                retr = input("Reincercati, apasati y, iesiti, apasati n: ").lower
                if retr == "y":
                    maths()
                elif retr == "n":
                    return 0
                else:
                    print("Doamne fereste, apasati enter ca sa iesiti")
                    input("")

        elif ach == 2:
            ah = input(
                "Pentru mijlocul segmentului, 1, pentru aflarea unui punct in functie de celaallt si de mijloc"
            )
            if ah == 1:
                Xa = 0.00
                Xb = 0.00
                Ya = 0.00
                Yb = 0.00
                Xa = input("Xa: ")
                Ya = input("Ya: ")
                Xb = input("Xb: ")
                Yb = input("Yb: ")
                try:
                    print(mij_sgmt(Xa, Xb, Ya, Yb))
                except:
                    ValueError
                print("Doar cifre, nu si litere")
                vr1 = ""
                vr1 = input("Pentru a  reincearca, apasa y, pentru a iesi, apasa n: ")
                if vr1 == "y":
                    Xa = input("Xa: ")
                    Ya = input("Ya: ")
                    Xb = input("Xb: ")
                    Yb = input("Yb: ")
                    print(mij_sgmt(Xa, Xb, Ya, Yb))
                    input("apasat enter ca sa iesiti")
                elif vr1 == "n":
                    print("Bye bye")
                else:
                    print("n/y NU ALT CEVA")
                    input("Apasati ENTER pentru a iesi")
            elif ah == 2:
                Xm = 0.0
                Ym = 0, 0
                Xa = 0.0
                Ya = 0.0
                Xm = input("Abscisa mijlocului: ")
                Ym = input("Ordonata mijlocului: ")
                Ya = input("Ordonata punctului cunoscut: ")
                Xa = input("Abscisa punctului cunoscut: ")
                pct_in_functie(Xm, Ym, Xa, Ya)


print("Buna")
print("Optiuni: ")
maths()
