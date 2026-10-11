package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dp3 {
    public static final dp3 x;
    public static final dp3 y;
    public static final /* synthetic */ dp3[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dp3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dp3] */
    static {
        ?? r0 = new Enum("Width", 0);
        x = r0;
        ?? r1 = new Enum("Height", 1);
        y = r1;
        z = new dp3[]{r0, r1};
    }

    public static dp3 valueOf(String str) {
        return (dp3) Enum.valueOf(dp3.class, str);
    }

    public static dp3[] values() {
        return (dp3[]) z.clone();
    }
}
