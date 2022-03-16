
package com.geekytoros.MultipleEntities.repository;

import com.geekytoros.MultipleEntities.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
