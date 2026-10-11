package gatewayprotocol.v1;

import defpackage.q71;
import gatewayprotocol.v1.TestDataOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class TestDataKt {
    public static final TestDataKt INSTANCE = new TestDataKt();

    private TestDataKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TestDataOuterClass.TestData.Builder _builder;

        private Dsl(TestDataOuterClass.TestData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TestDataOuterClass.TestData _build() {
            TestDataOuterClass.TestData build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        public final void clearForceGeoKey() {
            this._builder.clearForceGeoKey();
        }

        public final String getForceCampaignId() {
            String forceCampaignId = this._builder.getForceCampaignId();
            forceCampaignId.getClass();
            return forceCampaignId;
        }

        public final String getForceCountry() {
            String forceCountry = this._builder.getForceCountry();
            forceCountry.getClass();
            return forceCountry;
        }

        public final String getForceCountrySubdivision() {
            String forceCountrySubdivision = this._builder.getForceCountrySubdivision();
            forceCountrySubdivision.getClass();
            return forceCountrySubdivision;
        }

        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final String getForceGeoKey() {
            String forceGeoKey = this._builder.getForceGeoKey();
            forceGeoKey.getClass();
            return forceGeoKey;
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        public final boolean hasForceGeoKey() {
            return this._builder.hasForceGeoKey();
        }

        public final void setForceCampaignId(String str) {
            str.getClass();
            this._builder.setForceCampaignId(str);
        }

        public final void setForceCountry(String str) {
            str.getClass();
            this._builder.setForceCountry(str);
        }

        public final void setForceCountrySubdivision(String str) {
            str.getClass();
            this._builder.setForceCountrySubdivision(str);
        }

        public final void setForceExchangeTestMode(int i) {
            this._builder.setForceExchangeTestMode(i);
        }

        public final void setForceGeoKey(String str) {
            str.getClass();
            this._builder.setForceGeoKey(str);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(TestDataOuterClass.TestData.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TestDataOuterClass.TestData.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
