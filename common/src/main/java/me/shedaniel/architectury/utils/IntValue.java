/*
 * Copyright 2020 shedaniel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.shedaniel.architectury.utils;

import it.unimi.dsi.fastutil.ints.IntConsumer;

import java.util.function.IntSupplier;

public interface IntValue extends Value<Integer>, IntSupplier, IntConsumer {
    @Override
    default Integer get() {
        return getAsInt();
    }
}
