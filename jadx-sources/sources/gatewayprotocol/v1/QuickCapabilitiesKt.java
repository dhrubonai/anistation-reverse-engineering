package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import defpackage.q71;
import defpackage.ub2;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class QuickCapabilitiesKt {
    public static final QuickCapabilitiesKt INSTANCE = new QuickCapabilitiesKt();

    private QuickCapabilitiesKt() {
    }

    /* renamed from: -initializeandroid, reason: not valid java name */
    public final InitializationRequestOuterClass.QuickCapabilities.Android m128initializeandroid(ub2 ub2Var) {
        ub2Var.getClass();
        AndroidKt.Dsl.Companion companion = AndroidKt.Dsl.Companion;
        InitializationRequestOuterClass.QuickCapabilities.Android.Builder newBuilder = InitializationRequestOuterClass.QuickCapabilities.Android.newBuilder();
        newBuilder.getClass();
        AndroidKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    /* renamed from: -initializeios, reason: not valid java name */
    public final InitializationRequestOuterClass.QuickCapabilities.Ios m129initializeios(ub2 ub2Var) {
        ub2Var.getClass();
        IosKt.Dsl.Companion companion = IosKt.Dsl.Companion;
        InitializationRequestOuterClass.QuickCapabilities.Ios.Builder newBuilder = InitializationRequestOuterClass.QuickCapabilities.Ios.newBuilder();
        newBuilder.getClass();
        IosKt.Dsl _create = companion._create(newBuilder);
        ub2Var.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class AndroidKt {
        public static final AndroidKt INSTANCE = new AndroidKt();

        private AndroidKt() {
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final InitializationRequestOuterClass.QuickCapabilities.Android.Builder _builder;

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* loaded from: classes2.dex */
            public static final class CapabilitiesProxy extends DslProxy {
                private CapabilitiesProxy() {
                }
            }

            private Dsl(InitializationRequestOuterClass.QuickCapabilities.Android.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ InitializationRequestOuterClass.QuickCapabilities.Android _build() {
                InitializationRequestOuterClass.QuickCapabilities.Android build = this._builder.build();
                build.getClass();
                return build;
            }

            public final /* synthetic */ void addAllCapabilities(DslList dslList, Iterable iterable) {
                dslList.getClass();
                iterable.getClass();
                this._builder.addAllCapabilities(iterable);
            }

            public final /* synthetic */ void addCapabilities(DslList dslList, InitializationRequestOuterClass.QuickCapabilities.Android.Capability capability) {
                dslList.getClass();
                capability.getClass();
                this._builder.addCapabilities(capability);
            }

            public final /* synthetic */ void clearCapabilities(DslList dslList) {
                dslList.getClass();
                this._builder.clearCapabilities();
            }

            public final /* synthetic */ DslList getCapabilities() {
                List<InitializationRequestOuterClass.QuickCapabilities.Android.Capability> capabilitiesList = this._builder.getCapabilitiesList();
                capabilitiesList.getClass();
                return new DslList(capabilitiesList);
            }

            public final /* synthetic */ void plusAssignAllCapabilities(DslList<InitializationRequestOuterClass.QuickCapabilities.Android.Capability, CapabilitiesProxy> dslList, Iterable<? extends InitializationRequestOuterClass.QuickCapabilities.Android.Capability> iterable) {
                dslList.getClass();
                iterable.getClass();
                addAllCapabilities(dslList, iterable);
            }

            public final /* synthetic */ void plusAssignCapabilities(DslList<InitializationRequestOuterClass.QuickCapabilities.Android.Capability, CapabilitiesProxy> dslList, InitializationRequestOuterClass.QuickCapabilities.Android.Capability capability) {
                dslList.getClass();
                capability.getClass();
                addCapabilities(dslList, capability);
            }

            public final /* synthetic */ void setCapabilities(DslList dslList, int i, InitializationRequestOuterClass.QuickCapabilities.Android.Capability capability) {
                dslList.getClass();
                capability.getClass();
                this._builder.setCapabilities(i, capability);
            }

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* loaded from: classes2.dex */
            public static final class Companion {
                public /* synthetic */ Companion(q71 q71Var) {
                    this();
                }

                public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.QuickCapabilities.Android.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(InitializationRequestOuterClass.QuickCapabilities.Android.Builder builder, q71 q71Var) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class IosKt {
        public static final IosKt INSTANCE = new IosKt();

        private IosKt() {
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final InitializationRequestOuterClass.QuickCapabilities.Ios.Builder _builder;

            private Dsl(InitializationRequestOuterClass.QuickCapabilities.Ios.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ InitializationRequestOuterClass.QuickCapabilities.Ios _build() {
                InitializationRequestOuterClass.QuickCapabilities.Ios build = this._builder.build();
                build.getClass();
                return build;
            }

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* loaded from: classes2.dex */
            public static final class Companion {
                public /* synthetic */ Companion(q71 q71Var) {
                    this();
                }

                public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.QuickCapabilities.Ios.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(InitializationRequestOuterClass.QuickCapabilities.Ios.Builder builder, q71 q71Var) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.QuickCapabilities.Builder _builder;

        private Dsl(InitializationRequestOuterClass.QuickCapabilities.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ InitializationRequestOuterClass.QuickCapabilities _build() {
            InitializationRequestOuterClass.QuickCapabilities build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAndroid() {
            this._builder.clearAndroid();
        }

        public final void clearIos() {
            this._builder.clearIos();
        }

        public final void clearPlatformSpecific() {
            this._builder.clearPlatformSpecific();
        }

        public final InitializationRequestOuterClass.QuickCapabilities.Android getAndroid() {
            InitializationRequestOuterClass.QuickCapabilities.Android android2 = this._builder.getAndroid();
            android2.getClass();
            return android2;
        }

        public final InitializationRequestOuterClass.QuickCapabilities.Ios getIos() {
            InitializationRequestOuterClass.QuickCapabilities.Ios ios = this._builder.getIos();
            ios.getClass();
            return ios;
        }

        public final InitializationRequestOuterClass.QuickCapabilities.PlatformSpecificCase getPlatformSpecificCase() {
            InitializationRequestOuterClass.QuickCapabilities.PlatformSpecificCase platformSpecificCase = this._builder.getPlatformSpecificCase();
            platformSpecificCase.getClass();
            return platformSpecificCase;
        }

        public final boolean hasAndroid() {
            return this._builder.hasAndroid();
        }

        public final boolean hasIos() {
            return this._builder.hasIos();
        }

        public final void setAndroid(InitializationRequestOuterClass.QuickCapabilities.Android android2) {
            android2.getClass();
            this._builder.setAndroid(android2);
        }

        public final void setIos(InitializationRequestOuterClass.QuickCapabilities.Ios ios) {
            ios.getClass();
            this._builder.setIos(ios);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.QuickCapabilities.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.QuickCapabilities.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
