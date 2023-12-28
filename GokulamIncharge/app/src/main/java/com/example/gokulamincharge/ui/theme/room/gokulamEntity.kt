import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.gokulamincharge.ui.theme.ward.Pedi
import com.example.gokulamincharge.ui.theme.ward.Ward
import com.example.gokulamincharge.ui.theme.ward.Dermet

@Dao
interface WardDao {
    @Insert
    suspend fun insertWard(ward: Ward)

    @Query("SELECT * FROM Ward")
    suspend fun getAllWards(): List<Ward>
}

@Dao
interface PediDao {
    @Insert
    suspend fun insertPedi(pedi: Pedi)

    @Query("SELECT * FROM Pedi")
    suspend fun getAllPedis(): List<Pedi>
}

@Dao
interface DermetDao {
    @Insert
    suspend fun insertDermet(dermet: Dermet)

    @Query("SELECT * FROM Dermet")
    suspend fun getAllDermets(): List<Dermet>
}
