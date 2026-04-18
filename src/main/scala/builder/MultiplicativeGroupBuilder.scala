package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.MultiplicativeGroup
import com.alecdorrington.structures.evidence.function.FunctionIsMultiplicativeGroup
import com.alecdorrington.structures.evidence.future.FutureIsMultiplicativeGroup
import com.alecdorrington.structures.evidence.tuple.TupleIsMultiplicativeGroup
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeGroupBuilder

/** Methods for constructing [[MultiplicativeGroup]] type classes. */
trait MultiplicativeGroupBuilder
  extends OrderedMultiplicativeGroupBuilder,
          SemifieldBuilder,
          TupleIsMultiplicativeGroup,
          FutureIsMultiplicativeGroup,
          FunctionIsMultiplicativeGroup
