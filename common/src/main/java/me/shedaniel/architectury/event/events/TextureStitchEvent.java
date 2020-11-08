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

package me.shedaniel.architectury.event.events;

import me.shedaniel.architectury.event.Event;
import me.shedaniel.architectury.event.EventFactory;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

@Environment(EnvType.CLIENT)
public interface TextureStitchEvent {
    Event<Pre> PRE = EventFactory.createLoop(Pre.class);
    Event<Post> POST = EventFactory.createLoop(Post.class);
    
    @Environment(EnvType.CLIENT)
    interface Pre {
        void stitch(TextureAtlas atlas, Consumer<ResourceLocation> spriteAdder);
    }
    
    @Environment(EnvType.CLIENT)
    interface Post {
        void stitch(TextureAtlas atlas);
    }
}
