package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.numeric.{
  BooleanIsOrderedRing, NumericIsOrderedRing,
}
import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedRing
import com.alecdorrington.structures.ordered.OrderedRing

/** Methods for constructing [[OrderedRing]] type classes. */
trait OrderedRingBuilder
  extends OrderedEuclideanRingBuilder,
          BooleanIsOrderedRing,
          NumericIsOrderedRing,
          TupleIsOrderedRing
