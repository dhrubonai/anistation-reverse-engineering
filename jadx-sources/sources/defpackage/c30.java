package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class c30 {
    public static final /* synthetic */ c30[] x = {new Enum("PRESENT", 0), new Enum("ABSENT", 1), new Enum("PRESENT_OPTIONAL", 2), new Enum("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    c30 EF5;

    public static c30 valueOf(String str) {
        return (c30) Enum.valueOf(c30.class, str);
    }

    public static c30[] values() {
        return (c30[]) x.clone();
    }
}
