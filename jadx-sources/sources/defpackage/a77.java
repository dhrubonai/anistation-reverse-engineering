package defpackage;

import com.google.protobuf.CodedInputStream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class a77 {
    public static final x67 x;
    public static final y67 y;
    public static final /* synthetic */ a77[] z;

    static {
        x67 x67Var = new x67();
        x = x67Var;
        y67 y67Var = new y67();
        y = y67Var;
        z = new a77[]{x67Var, y67Var, new a77() { // from class: z67
            @Override // defpackage.a77
            public final Object a(CodedInputStream codedInputStream) {
                return codedInputStream.readBytes();
            }
        }};
    }

    public static a77 valueOf(String str) {
        return (a77) Enum.valueOf(a77.class, str);
    }

    public static a77[] values() {
        return (a77[]) z.clone();
    }

    public Object a(CodedInputStream codedInputStream) {
        return codedInputStream.readString();
    }
}
