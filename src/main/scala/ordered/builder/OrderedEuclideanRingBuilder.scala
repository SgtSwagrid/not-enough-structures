package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.numeric.{
  BigIntIsOrderedEuclideanRing, ByteIsOrderedEuclideanRing,
  IntegralIsOrderedEuclideanRing, IntIsOrderedEuclideanRing,
  LongIsOrderedEuclideanRing, ShortIsOrderedEuclideanRing,
}
import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedEuclideanRing
import com.alecdorrington.structures.ordered.OrderedEuclideanRing

/** Methods for constructing [[OrderedEuclideanRing]] type classes. */
trait OrderedEuclideanRingBuilder
  extends OrderedFieldBuilder,
          ByteIsOrderedEuclideanRing,
          ShortIsOrderedEuclideanRing,
          IntIsOrderedEuclideanRing,
          LongIsOrderedEuclideanRing,
          BigIntIsOrderedEuclideanRing,
          IntegralIsOrderedEuclideanRing,
          TupleIsOrderedEuclideanRing
