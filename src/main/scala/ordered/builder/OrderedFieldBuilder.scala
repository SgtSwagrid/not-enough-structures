package com.alecdorrington.structures
package ordered.builder

import com.alecdorrington.structures.evidence.numeric.{
  DoubleIsOrderedEuclideanRing, FloatIsOrderedField, FractionalIsOrderedField,
}
import com.alecdorrington.structures.evidence.trivial.{
  EmptyTupleIsOrderedField, NoneIsOrderedField, NothingIsOrderedField,
  SingletonIsOrderedField, UnitIsOrderedField,
}
import com.alecdorrington.structures.evidence.tuple.TupleIsOrderedField
import com.alecdorrington.structures.ordered.OrderedField

/** Methods for constructing [[OrderedField]] type classes. */
trait OrderedFieldBuilder
  extends DoubleIsOrderedEuclideanRing,
          EmptyTupleIsOrderedField,
          FloatIsOrderedField,
          NoneIsOrderedField,
          NothingIsOrderedField,
          UnitIsOrderedField,
          SingletonIsOrderedField,
          FractionalIsOrderedField,
          TupleIsOrderedField
