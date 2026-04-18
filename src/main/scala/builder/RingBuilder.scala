package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.Ring
import com.alecdorrington.structures.evidence.function.FunctionIsRing
import com.alecdorrington.structures.evidence.future.FutureIsRing
import com.alecdorrington.structures.evidence.tuple.TupleIsRing
import com.alecdorrington.structures.ordered.builder.OrderedRingBuilder

/** Methods for constructing [[Ring]] type classes. */
trait RingBuilder
  extends OrderedRingBuilder,
          EuclideanRingBuilder,
          TupleIsRing,
          FutureIsRing,
          FunctionIsRing
