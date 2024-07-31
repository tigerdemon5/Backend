package com.likelion.timer.domain.Timer.dto.res;

import java.util.List;

import com.likelion.timer.domain.Timer.domain.entity.Timer;
import com.likelion.timer.domain.model.TimerStateTypeEnum;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TimerResDto {
	private Long userId;
	private float cycle;
	private TimerStateTypeEnum timerState;
	private boolean isPermanent;
	private boolean isSettingByUser;
	private List<PartListResDto> partLists;

	public static TimerResDto fromEntity(Timer timer) {
		return TimerResDto.builder()
			.userId(timer.getUser().getId())
			.timerState(timer.getTimerState())
			.cycle(timer.getCycle())
			.isSettingByUser(timer.getIsSettingByUser())
			.isPermanent(timer.getIsPermanent())
			.isSettingByUser(timer.getIsSettingByUser())
			.partLists(timer.getPartLists().stream()
				.map(PartListResDto::fromEntity)
				.toList())
			.build();
	}
}