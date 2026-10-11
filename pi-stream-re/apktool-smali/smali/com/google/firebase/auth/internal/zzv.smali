.class public final Lcom/google/firebase/auth/internal/zzv;
.super Lcom/google/firebase/auth/ActionCodeMultiFactorInfo;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/firebase/auth/MultiFactorInfo;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/auth/MultiFactorInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/auth/ActionCodeMultiFactorInfo;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw7/b;->o(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/firebase/auth/ActionCodeInfo;->email:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p2}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzv;->zza:Lcom/google/firebase/auth/MultiFactorInfo;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final getMultiFactorInfo()Lcom/google/firebase/auth/MultiFactorInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzv;->zza:Lcom/google/firebase/auth/MultiFactorInfo;

    .line 2
    .line 3
    return-object v0
.end method
