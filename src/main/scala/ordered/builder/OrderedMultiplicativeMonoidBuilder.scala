package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedMultiplicativeMonoid
import com.alecdorrington.structures.ordered.OrderedMultiplicativeMonoid

/** Methods for constructing [[OrderedMultiplicativeMonoid]] type classes. */
trait OrderedMultiplicativeMonoidBuilder
  extends OrderedEuclideanMonoidBuilder,
          OrderedSemiringBuilder,
          TupleIsOrderedMultiplicativeMonoid
