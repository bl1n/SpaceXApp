
package com.lft.spacex.model.launches;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SecondStage {

    @SerializedName("block")
    private Long mBlock;
    @SerializedName("payloads")
    private List<Payload> mPayloads;

    public Long getBlock() {
        return mBlock;
    }

    public List<Payload> getPayloads() {
        return mPayloads;
    }

    public static class Builder {

        private Long mBlock;
        private List<Payload> mPayloads;

        public SecondStage.Builder withBlock(Long block) {
            mBlock = block;
            return this;
        }

        public SecondStage.Builder withPayloads(List<Payload> payloads) {
            mPayloads = payloads;
            return this;
        }

        public SecondStage build() {
            SecondStage secondStage = new SecondStage();
            secondStage.mBlock = mBlock;
            secondStage.mPayloads = mPayloads;
            return secondStage;
        }

    }

}
