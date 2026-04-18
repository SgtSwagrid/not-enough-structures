package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedEuclideanMonoid
import com.alecdorrington.structures.ordered.OrderedEuclideanMonoid

/** Methods for constructing [[OrderedEuclideanMonoid]] type classes. */
trait OrderedEuclideanMonoidBuilder
  extends OrderedMultiplicativeGroupBuilder,
          OrderedEuclideanRingBuilder,
          TupleIsOrderedEuclideanMonoid
