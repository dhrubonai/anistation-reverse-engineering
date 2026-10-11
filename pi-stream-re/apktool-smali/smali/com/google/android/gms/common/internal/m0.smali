.class public final Lcom/google/android/gms/common/internal/m0;
.super Lc5/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/m0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/os/Bundle;

.field public final b:[Lb5/c;

.field public final c:I

.field public final d:Lcom/google/android/gms/common/internal/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/y;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/y;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/internal/m0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;[Lb5/c;ILcom/google/android/gms/common/internal/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/internal/m0;->a:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/google/android/gms/common/internal/m0;->b:[Lb5/c;

    iput p3, p0, Lcom/google/android/gms/common/internal/m0;->c:I

    iput-object p4, p0, Lcom/google/android/gms/common/internal/m0;->d:Lcom/google/android/gms/common/internal/i;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lcom/google/android/gms/common/internal/m0;->a:Landroid/os/Bundle;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, v3}, Lp7/a0;->e0(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/common/internal/m0;->b:[Lb5/c;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, p2}, Lp7/a0;->r0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    iget v2, p0, Lcom/google/android/gms/common/internal/m0;->c:I

    .line 22
    .line 23
    invoke-static {p1, v1, v2}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    iget-object v2, p0, Lcom/google/android/gms/common/internal/m0;->d:Lcom/google/android/gms/common/internal/i;

    .line 28
    .line 29
    invoke-static {p1, v1, v2, p2, v3}, Lp7/a0;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
