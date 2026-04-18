package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedMultiplicativeSemigroup
import com.alecdorrington.structures.ordered.OrderedMultiplicativeSemigroup

/** Methods for constructing [[OrderedMultiplicativeSemigroup]] type classes. */
trait OrderedMultiplicativeSemigroupBuilder
  extends OrderedMultiplicativeMonoidBuilder,
          TupleIsOrderedMultiplicativeSemigroup
