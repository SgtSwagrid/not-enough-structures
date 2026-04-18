package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.AdditiveGroup
import com.alecdorrington.structures.evidence.function.FunctionIsAdditiveGroup
import com.alecdorrington.structures.evidence.future.FutureIsAdditiveGroup
import com.alecdorrington.structures.evidence.tuple.TupleIsAdditiveGroup
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveGroupBuilder

/** Methods for constructing [[AdditiveGroup]] type classes. */
trait AdditiveGroupBuilder
  extends OrderedAdditiveGroupBuilder,
          RingBuilder,
          TupleIsAdditiveGroup,
          FutureIsAdditiveGroup,
          FunctionIsAdditiveGroup
