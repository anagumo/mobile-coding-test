import UIKit

var str = "Strictly increasing sequence"
/**
 Recursivamente puede hacerse de la siguiente forma:
 Ej. Una pareja de duplicados
 -> 1, 4, 10, 4, 2  remover ++
 -> 1, 4, 10, 2     remover ++
 -> 1, 4, 10        valida
 
 Se removió más de un elemento :. false
 
 Ej. Más de una pareja de duplicados
 -> 1, 2, 1, 2      remover++
 -> 1, 2, 2         remover++
 -> 1, 2            valida
 
 Se removió más de un elemento :. false
 
 Ej. Sin duplicados
 -> 1, 3, 2         remover++
 -> 1, 3            valida
 
 Se removió sólo un elemento :. true
 
 -> 1, 3, 2, 1      remover++
 -> 1, 3, 1         remover++
 -> 1, 3            valida
 
 Se removió más de un elemento :. false
 **/

var removed = 0

func almostIncreasingSequence(sequence: [Int]) -> Bool {
    var increasingSequence = sequence
    for (index, number) in increasingSequence.enumerated() {
        let isValidIndex = increasingSequence.indices.contains(index + 1)
        if isValidIndex {
            if increasingSequence[index + 1] <= number {
                increasingSequence.remove(at: index + 1)
                removed = removed + 1
                almostIncreasingSequence(sequence: increasingSequence)
            }
        }
    }
    print(increasingSequence)
    return (removed > 1) ? false : true
}

almostIncreasingSequence(sequence: [2,2,3,1])
