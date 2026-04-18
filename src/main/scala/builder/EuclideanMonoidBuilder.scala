package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.EuclideanMonoid
import com.alecdorrington.structures.evidence.function.FunctionIsEuclideanMonoid
import com.alecdorrington.structures.evidence.future.FutureIsEuclideanMonoid
import com.alecdorrington.structures.evidence.tuple.TupleIsEuclideanMonoid
import com.alecdorrington.structures.ordered.builder.OrderedEuclideanMonoidBuilder

/** Methods for constructing [[EuclideanMonoid]] type classes. */
trait EuclideanMonoidBuilder
  extends OrderedEuclideanMonoidBuilder,
          MultiplicativeGroupBuilder,
          EuclideanRingBuilder,
          TupleIsEuclideanMonoid,
          FutureIsEuclideanMonoid,
          FunctionIsEuclideanMonoid
