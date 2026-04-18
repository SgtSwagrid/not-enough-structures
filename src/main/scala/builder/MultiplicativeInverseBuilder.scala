package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.MultiplicativeInverse
import com.alecdorrington.structures.evidence.function.FunctionIsMultiplicativeInverse
import com.alecdorrington.structures.evidence.future.FutureIsMultiplicativeInverse
import com.alecdorrington.structures.evidence.tuple.TupleIsMultiplicativeInverse
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeInverseBuilder

/** Methods for constructing [[MultiplicativeInverse]] type classes. */
trait MultiplicativeInverseBuilder
  extends OrderedMultiplicativeInverseBuilder,
          MultiplicativeGroupBuilder,
          TupleIsMultiplicativeInverse,
          FutureIsMultiplicativeInverse,
          FunctionIsMultiplicativeInverse
