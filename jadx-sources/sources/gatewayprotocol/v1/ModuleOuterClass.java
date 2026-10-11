package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.g04;
import defpackage.ze0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ModuleOuterClass {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public interface ModuleOrBuilder extends MessageLiteOrBuilder {
        ByteString getConfig();

        String getName();

        ByteString getNameBytes();
    }

    private ModuleOuterClass() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Module extends GeneratedMessageLite<Module, Builder> implements ModuleOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        private static final Module DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<Module> PARSER;
        private String name_ = "";
        private ByteString config_ = ByteString.EMPTY;

        static {
            Module module = new Module();
            DEFAULT_INSTANCE = module;
            GeneratedMessageLite.registerDefaultInstance(Module.class, module);
        }

        private Module() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = getDefaultInstance().getConfig();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public static Module getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Module parseDelimitedFrom(InputStream inputStream) {
            return (Module) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Module parseFrom(ByteBuffer byteBuffer) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Module> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfig(ByteString byteString) {
            byteString.getClass();
            this.config_ = byteString;
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

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = g04.a[methodToInvoke.ordinal()];
            g04 g04Var = null;
            switch (i) {
                case 1:
                    return new Module();
                case 2:
                    return new Builder(g04Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"name_", "config_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Module> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (Module.class) {
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

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public ByteString getConfig() {
            return this.config_;
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Module, Builder> implements ModuleOrBuilder {
            private Builder() {
                super(Module.DEFAULT_INSTANCE);
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((Module) this.instance).clearConfig();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Module) this.instance).clearName();
                return this;
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public ByteString getConfig() {
                return ((Module) this.instance).getConfig();
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public String getName() {
                return ((Module) this.instance).getName();
            }

            @Override // gatewayprotocol.v1.ModuleOuterClass.ModuleOrBuilder
            public ByteString getNameBytes() {
                return ((Module) this.instance).getNameBytes();
            }

            public Builder setConfig(ByteString byteString) {
                copyOnWrite();
                ((Module) this.instance).setConfig(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((Module) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Module) this.instance).setNameBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(g04 g04Var) {
                this();
            }
        }

        public static Builder newBuilder(Module module) {
            return DEFAULT_INSTANCE.createBuilder(module);
        }

        public static Module parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Module) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Module parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Module parseFrom(ByteString byteString) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Module parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Module parseFrom(byte[] bArr) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Module parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Module parseFrom(InputStream inputStream) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Module parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Module parseFrom(CodedInputStream codedInputStream) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Module parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Module) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
