package com.alecdorrington.structures
package builder

import com.alecdorrington.structures.evidence.collection.{
  ArrayIsAdditiveMonoid, ArraySeqIsAdditiveMonoid, EitherIsAdditiveMonoid,
  IArrayIsAdditiveMonoid, LazyListIsAdditiveMonoid, ListIsAdditiveMonoid,
  MapIsAdditiveMonoid, OptionIsAdditiveMonoid, QueueIsAdditiveMonoid,
  SeqIsAdditiveMonoid, SetIsAdditiveMonoid, SortedMapIsAdditiveMonoid,
  SortedSetIsAdditiveMonoid, StringIsAdditiveMonoid, TryIsAdditiveMonoid,
  VectorIsAdditiveMonoid,
}
import com.alecdorrington.structures.evidence.function.FunctionIsAdditiveMonoid
import com.alecdorrington.structures.evidence.future.FutureIsAdditiveMonoid
import com.alecdorrington.structures.evidence.tuple.TupleIsAdditiveMonoid
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveMonoidBuilder

/** Methods for constructing [[AdditiveMonoid]] type classes. */
trait AdditiveMonoidBuilder
  extends OrderedAdditiveMonoidBuilder,
          DifferenceMonoidBuilder,
          SemiringBuilder,
          StringIsAdditiveMonoid,
          SeqIsAdditiveMonoid,
          ListIsAdditiveMonoid,
          VectorIsAdditiveMonoid,
          ArrayIsAdditiveMonoid,
          ArraySeqIsAdditiveMonoid,
          IArrayIsAdditiveMonoid,
          LazyListIsAdditiveMonoid,
          SetIsAdditiveMonoid,
          SortedSetIsAdditiveMonoid,
          MapIsAdditiveMonoid,
          SortedMapIsAdditiveMonoid,
          OptionIsAdditiveMonoid,
          TupleIsAdditiveMonoid,
          QueueIsAdditiveMonoid,
          EitherIsAdditiveMonoid,
          TryIsAdditiveMonoid,
          FutureIsAdditiveMonoid,
          FunctionIsAdditiveMonoid
