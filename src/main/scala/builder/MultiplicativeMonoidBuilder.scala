package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.MultiplicativeMonoid
import com.alecdorrington.structures.evidence.function.FunctionIsMultiplicativeMonoid
import com.alecdorrington.structures.evidence.future.FutureIsMultiplicativeMonoid
import com.alecdorrington.structures.evidence.tuple.TupleIsMultiplicativeMonoid
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeMonoidBuilder

/** Methods for constructing [[MultiplicativeMonoid]] type classes. */
trait MultiplicativeMonoidBuilder
  extends OrderedMultiplicativeMonoidBuilder,
          EuclideanMonoidBuilder,
          SemiringBuilder,
          TupleIsMultiplicativeMonoid,
          FutureIsMultiplicativeMonoid,
          FunctionIsMultiplicativeMonoid
