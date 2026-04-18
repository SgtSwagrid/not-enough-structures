package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedAdditiveSemigroup
import com.alecdorrington.structures.ordered.OrderedAdditiveSemigroup

/** Methods for constructing [[OrderedAdditiveSemigroup]] type classes. */
trait OrderedAdditiveSemigroupBuilder
  extends OrderedAdditiveMonoidBuilder, TupleIsOrderedAdditiveSemigroup
