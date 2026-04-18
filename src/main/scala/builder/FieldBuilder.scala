package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.Field
import com.alecdorrington.structures.evidence.function.FunctionIsField
import com.alecdorrington.structures.evidence.future.FutureIsField
import com.alecdorrington.structures.evidence.tuple.TupleIsField
import com.alecdorrington.structures.ordered.builder.OrderedFieldBuilder

/** Methods for constructing [[Field]] type classes. */
trait FieldBuilder
  extends OrderedFieldBuilder, TupleIsField, FutureIsField, FunctionIsField
