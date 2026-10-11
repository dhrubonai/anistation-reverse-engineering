package com.anistation.model.animelist;

import defpackage.a34;
import defpackage.h11;
import defpackage.qx1;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ExportResult {
    private final int exportedCount;
    private final String fileName;
    private final int skippedNoMalIdCount;
    private final String uriString;

    public ExportResult(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.uriString = str;
        this.fileName = str2;
        this.exportedCount = i;
        this.skippedNoMalIdCount = i2;
    }

    public static /* synthetic */ ExportResult copy$default(ExportResult exportResult, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = exportResult.uriString;
        }
        if ((i3 & 2) != 0) {
            str2 = exportResult.fileName;
        }
        if ((i3 & 4) != 0) {
            i = exportResult.exportedCount;
        }
        if ((i3 & 8) != 0) {
            i2 = exportResult.skippedNoMalIdCount;
        }
        return exportResult.copy(str, str2, i, i2);
    }

    public final String component1() {
        return this.uriString;
    }

    public final String component2() {
        return this.fileName;
    }

    public final int component3() {
        return this.exportedCount;
    }

    public final int component4() {
        return this.skippedNoMalIdCount;
    }

    public final ExportResult copy(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        return new ExportResult(str, str2, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportResult)) {
            return false;
        }
        ExportResult exportResult = (ExportResult) obj;
        if (a34.i(this.uriString, exportResult.uriString) && a34.i(this.fileName, exportResult.fileName) && this.exportedCount == exportResult.exportedCount && this.skippedNoMalIdCount == exportResult.skippedNoMalIdCount) {
            return true;
        }
        return false;
    }

    public final int getExportedCount() {
        return this.exportedCount;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getSkippedNoMalIdCount() {
        return this.skippedNoMalIdCount;
    }

    public final String getUriString() {
        return this.uriString;
    }

    public int hashCode() {
        return Integer.hashCode(this.skippedNoMalIdCount) + qx1.c(this.exportedCount, zo5.i(this.fileName, this.uriString.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.uriString;
        String str2 = this.fileName;
        int i = this.exportedCount;
        int i2 = this.skippedNoMalIdCount;
        StringBuilder o = h11.o("ExportResult(uriString=", str, ", fileName=", str2, ", exportedCount=");
        o.append(i);
        o.append(", skippedNoMalIdCount=");
        o.append(i2);
        o.append(")");
        return o.toString();
    }
}
