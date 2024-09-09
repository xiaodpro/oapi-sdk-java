// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.lark.oapi.service.moments;

import com.lark.oapi.core.Config;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.moments.v1.V1;
import com.lark.oapi.service.moments.v1.model.*;

public class MomentsService {
    private final V1 v1;

    public MomentsService(Config config) {
        this.v1 = new V1(config);
    }

    public V1 v1() {
        return v1;
    }

    public abstract static class P2CommentCreatedV1Handler implements IEventHandler<P2CommentCreatedV1> {
        @Override
        public P2CommentCreatedV1 getEvent() {
            return new P2CommentCreatedV1();
        }
    }

    public abstract static class P2CommentDeletedV1Handler implements IEventHandler<P2CommentDeletedV1> {
        @Override
        public P2CommentDeletedV1 getEvent() {
            return new P2CommentDeletedV1();
        }
    }

    public abstract static class P2DislikeCreatedV1Handler implements IEventHandler<P2DislikeCreatedV1> {
        @Override
        public P2DislikeCreatedV1 getEvent() {
            return new P2DislikeCreatedV1();
        }
    }

    public abstract static class P2DislikeDeletedV1Handler implements IEventHandler<P2DislikeDeletedV1> {
        @Override
        public P2DislikeDeletedV1 getEvent() {
            return new P2DislikeDeletedV1();
        }
    }

    public abstract static class P2PostCreatedV1Handler implements IEventHandler<P2PostCreatedV1> {
        @Override
        public P2PostCreatedV1 getEvent() {
            return new P2PostCreatedV1();
        }
    }

    public abstract static class P2PostDeletedV1Handler implements IEventHandler<P2PostDeletedV1> {
        @Override
        public P2PostDeletedV1 getEvent() {
            return new P2PostDeletedV1();
        }
    }

    public abstract static class P2PostStatisticsUpdatedV1Handler implements IEventHandler<P2PostStatisticsUpdatedV1> {
        @Override
        public P2PostStatisticsUpdatedV1 getEvent() {
            return new P2PostStatisticsUpdatedV1();
        }
    }

    public abstract static class P2ReactionCreatedV1Handler implements IEventHandler<P2ReactionCreatedV1> {
        @Override
        public P2ReactionCreatedV1 getEvent() {
            return new P2ReactionCreatedV1();
        }
    }

    public abstract static class P2ReactionDeletedV1Handler implements IEventHandler<P2ReactionDeletedV1> {
        @Override
        public P2ReactionDeletedV1 getEvent() {
            return new P2ReactionDeletedV1();
        }
    }
}