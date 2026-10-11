.class public final Lcom/google/android/gms/internal/base/zad;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zaa:Lb5/c;

.field public static final zab:[Lb5/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lb5/c;

    .line 2
    .line 3
    const-string v1, "CLIENT_TELEMETRY"

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, Lb5/c;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/google/android/gms/internal/base/zad;->zaa:Lb5/c;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    new-array v1, v1, [Lb5/c;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v0, v1, v2

    .line 17
    .line 18
    sput-object v1, Lcom/google/android/gms/internal/base/zad;->zab:[Lb5/c;

    .line 19
    .line 20
    return-void
.end method
