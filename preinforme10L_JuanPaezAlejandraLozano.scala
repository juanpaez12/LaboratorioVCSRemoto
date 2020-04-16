def Utilidad(): Array[Int] = {
		var Utilidad = Array(27834, 23789, 30189, 30967, 32501, 32701, 31665, 17155, 4614, 834)
        return Utilidad
}                                       
	

def difMediaUltPri(Utility : Array[Int]): Int = {
    val cant = Utility.length
    val prom1 = (Utility(cant-1) + Utility(cant-2))/2
    val prom2 = (Utility(0) + Utility(1))/2
    val dif = prom1 - prom2
    return dif
}                                               



def difMayorMenor(Utility : Array[Int]): Int = {
    val cant = Utility.length
    var mayor = Utility(0)
    var menor = Utility(0)
    for (i <- 0 to cant-1) {
        if (mayor < Utility(i)) {
            mayor = Utility(i)
        }
        if (menor > Utility(i)) {
            menor = Utility(i)
        }
    }
    val dif2 = mayor - menor
    return dif2
}                                             


def mediana(Utility : Array[Int]): Float = {
    val cant = Utility.length
    var orden = 0
    for (x <- 0 to cant-1) {
        for (i <- 0 to cant-2) {
            if (Utility(i) > Utility(i+1)) {
                orden = Utility(i)
                Utility(i)= Utility(i+1)
                Utility(i+1) = orden
            }
        }
    }
    val mitad = cant/2
    if (cant%2==0) {
        var median = ((Utility(mitad)+Utility(mitad-1)):Float)/2
        return median
    } else {
        var median = Utility(mitad+1)
        return median
    }
}


def mediaMediana(Utility : Array[Int]): Unit = {
    val Mediana = mediana(Utility)
    val cant = Utility.length
    var s = 0
    for (i <- 0 to cant-1) {
        s += Utility(i)
    }
    val prom = (s: Float)/cant
    val dif = Mediana - prom
    println("La mediana es " + Mediana + " y el promedio es " + prom + "; la diferencia entre la mediana y la media es " + dif)  
}


def porcentajeAcum(Utility : Array[Int]):Unit = {
    var s = 0
    var porc = (0: Float)
    val cant = Utility.length 
    for (i <- 0 to cant-1) {
        s += Utility(i)  
    }
    var a = 2007
    for (i <- 0 to cant-1) {
        porc = ((Utility(i)*100):Float)/(s:Float)
        a += 1
        println("El porcentaje que aporta el año " + a + " al acumulado es " + porc + "%")
    }
}


def deficitCOP(Utility : Array[Int]):Int = {
    val cant = Utility.length
    val deficit = Utility(cant-2) - Utility(cant-1)
    return deficit
}


def porcentajedeficit(Utility : Array[Int]): Unit = {
    val cant = Utility.length
    var d = 0 : Float
    var defic = 0: Float
    var año = 2008
    for (i <- 0 to cant-2) {
        d = Utility(i) - Utility(i+1)
        defic =  ((d*100)/Utility(i)): Float
        año += 1
        println("El porcentaje de deficit para el año " + año + " es " + defic + "%")
    }
}

  //---------------------------------------------------------------Principal----------------------------------------------------------------//

var Utility = Utilidad()            
println("La diferencia del promedio de los ultimos años y los primeros años es: " + difMediaUltPri(Utility))
println("La diferencia entre las utilidades operaciones del año con mayor utilidad y el de menor utilidad es: " + difMayorMenor(Utility))
porcentajeAcum(Utility)
println("El deficit del año 2017 con respecto al año anterior es de " + deficitCOP(Utility) + " millones de COP")
porcentajedeficit(Utility)
println("La mediana es: " + mediana(Utility))
mediaMediana(Utility)