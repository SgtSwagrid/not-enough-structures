package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.EuclideanRing
import com.alecdorrington.structures.evidence.function.FunctionIsEuclideanRing
import com.alecdorrington.structures.evidence.future.FutureIsEuclideanRing
import com.alecdorrington.structures.evidence.tuple.TupleIsEuclideanRing
import com.alecdorrington.structures.ordered.builder.OrderedEuclideanRingBuilder

/** Methods for constructing [[EuclideanRing]] type classes. */
trait EuclideanRingBuilder
  extends OrderedEuclideanRingBuilder,
          FieldBuilder,
          TupleIsEuclideanRing,
          FutureIsEuclideanRing,
          FunctionIsEuclideanRing
