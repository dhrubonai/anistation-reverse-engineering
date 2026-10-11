package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.f04;
import defpackage.ze0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ModuleInitParamsOuterClass {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public interface ModuleInitParamsOrBuilder extends MessageLiteOrBuilder {
        String getClassName();

        ByteString getClassNameBytes();

        String getName();

        ByteString getNameBytes();

        ByteString getParams();
    }

    private ModuleInitParamsOuterClass() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class ModuleInitParams extends GeneratedMessageLite<ModuleInitParams, Builder> implements ModuleInitParamsOrBuilder {
        public static final int CLASS_NAME_FIELD_NUMBER = 3;
        private static final ModuleInitParams DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile Parser<ModuleInitParams> PARSER;
        private String name_ = "";
        private ByteString params_ = ByteString.EMPTY;
        private String className_ = "";

        static {
            ModuleInitParams moduleInitParams = new ModuleInitParams();
            DEFAULT_INSTANCE = moduleInitParams;
            GeneratedMessageLite.registerDefaultInstance(ModuleInitParams.class, moduleInitParams);
        }

        private ModuleInitParams() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClassName() {
            this.className_ = getDefaultInstance().getClassName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParams() {
            this.params_ = getDefaultInstance().getParams();
        }

        public static ModuleInitParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ModuleInitParams parseDelimitedFrom(InputStream inputStream) {
            return (ModuleInitParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ModuleInitParams parseFrom(ByteBuffer byteBuffer) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ModuleInitParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClassName(String str) {
            str.getClass();
            this.className_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClassNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.className_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParams(ByteString byteString) {
            byteString.getClass();
            this.params_ = byteString;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = f04.a[methodToInvoke.ordinal()];
            f04 f04Var = null;
            switch (i) {
                case 1:
                    return new ModuleInitParams();
                case 2:
                    return new Builder(f04Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ", new Object[]{"name_", "params_", "className_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ModuleInitParams> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (ModuleInitParams.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return (byte) 1;
                default:
                    ze0.d();
                case 7:
                    return null;
            }
        }

        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public String getClassName() {
            return this.className_;
        }

        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public ByteString getClassNameBytes() {
            return ByteString.copyFromUtf8(this.className_);
        }

        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
        public ByteString getParams() {
            return this.params_;
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<ModuleInitParams, Builder> implements ModuleInitParamsOrBuilder {
            private Builder() {
                super(ModuleInitParams.DEFAULT_INSTANCE);
            }

            public Builder clearClassName() {
                copyOnWrite();
                ((ModuleInitParams) this.instance).clearClassName();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((ModuleInitParams) this.instance).clearName();
                return this;
            }

            public Builder clearParams() {
                copyOnWrite();
                ((ModuleInitParams) this.instance).clearParams();
                return this;
            }

            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public String getClassName() {
                return ((ModuleInitParams) this.instance).getClassName();
            }

            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public ByteString getClassNameBytes() {
                return ((ModuleInitParams) this.instance).getClassNameBytes();
            }

            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public String getName() {
                return ((ModuleInitParams) this.instance).getName();
            }

            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public ByteString getNameBytes() {
                return ((ModuleInitParams) this.instance).getNameBytes();
            }

            @Override // gatewayprotocol.v1.ModuleInitParamsOuterClass.ModuleInitParamsOrBuilder
            public ByteString getParams() {
                return ((ModuleInitParams) this.instance).getParams();
            }

            public Builder setClassName(String str) {
                copyOnWrite();
                ((ModuleInitParams) this.instance).setClassName(str);
                return this;
            }

            public Builder setClassNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ModuleInitParams) this.instance).setClassNameBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((ModuleInitParams) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ModuleInitParams) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setParams(ByteString byteString) {
                copyOnWrite();
                ((ModuleInitParams) this.instance).setParams(byteString);
                return this;
            }

            public /* synthetic */ Builder(f04 f04Var) {
                this();
            }
        }

        public static Builder newBuilder(ModuleInitParams moduleInitParams) {
            return DEFAULT_INSTANCE.createBuilder(moduleInitParams);
        }

        public static ModuleInitParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModuleInitParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ModuleInitParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ModuleInitParams parseFrom(ByteString byteString) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ModuleInitParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ModuleInitParams parseFrom(byte[] bArr) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ModuleInitParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ModuleInitParams parseFrom(InputStream inputStream) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ModuleInitParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ModuleInitParams parseFrom(CodedInputStream codedInputStream) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ModuleInitParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ModuleInitParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
