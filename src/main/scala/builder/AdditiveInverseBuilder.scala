package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.AdditiveInverse
import com.alecdorrington.structures.evidence.function.FunctionIsAdditiveInverse
import com.alecdorrington.structures.evidence.future.FutureIsAdditiveInverse
import com.alecdorrington.structures.evidence.tuple.TupleIsAdditiveInverse
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveInverseBuilder

/** Methods for constructing [[AdditiveInverse]] type classes. */
trait AdditiveInverseBuilder
  extends OrderedAdditiveInverseBuilder,
          AdditiveGroupBuilder,
          TupleIsAdditiveInverse,
          FutureIsAdditiveInverse,
          FunctionIsAdditiveInverse
